/*
 * Copyright 2009 Erhard Kuenzel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cTree.cAlter;

import java.util.ArrayList;
import java.util.Collections;

import cTree.CElement;
import cTree.CPComparator;
import cTree.CPlusRow;
import cTree.adapter.C_Event;
import cTree.cDefence.CD_Event;

public class CA_PlusRow_Sort extends CA_Base {

    @Override
    public CElement doIt(final CD_Event message) {
        final CElement first = this.getEvent().getFirst();
        if (first instanceof CPlusRow) {
            final CPlusRow old = (CPlusRow) first;
            final ArrayList<CElement> sumMembers = old.getMemberList();
            Collections.sort(sumMembers, new CPComparator());
            if (sumMembers.size() > 0) {
                for (int i = 1; i < sumMembers.size(); i++) {
                    if (sumMembers.get(i).hasExtNull()) {
                        sumMembers.get(i).setPraefix("+");
                    }
                }
            }
            final CPlusRow newRow = CPlusRow.createRow(sumMembers);
            newRow.correctInternalPraefixesAndRolle();
            first.getParent().replaceChild(newRow, first, true, true);
            return newRow;
        } else {
            return first;
        }
    }

    @Override
    public String getText() {
        return "Summanden sortieren";
    }

    @Override
    public boolean canDo() {
        final C_Event event = this.getEvent();
        final ArrayList<CElement> els = event.getSelection();
        return (els.size() > 0 && (els.get(0) instanceof CPlusRow));
    }

}
