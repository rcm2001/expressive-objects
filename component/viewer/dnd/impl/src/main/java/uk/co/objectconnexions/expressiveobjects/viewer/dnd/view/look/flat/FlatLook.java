/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package uk.co.objectconnexions.expressiveobjects.viewer.dnd.view.look.flat;

import uk.co.objectconnexions.expressiveobjects.viewer.dnd.view.Look;
import uk.co.objectconnexions.expressiveobjects.viewer.dnd.view.control.Button;
import uk.co.objectconnexions.expressiveobjects.viewer.dnd.view.window.AbstractWindowBorder;

public class FlatLook implements Look {

    @Override
    public void install() {
        AbstractWindowBorder.setBorderRenderer(new FlatStyleWindowBorder());
        Button.setButtonRender(new ButtonFlatStyleRender());
    }

    @Override
    public String getName() {
        return "Flat";
    }

}