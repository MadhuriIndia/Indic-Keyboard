/**
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.android.inputmethod.latin.dicttool;

import com.android.inputmethod.latin.makedict.UnsupportedFormatException;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Makedict extends Dicttool.Command {
    public static final String COMMAND = "makedict";

    public Makedict() {
    }

    @Override
    public String getHelp() {
        return DictionaryMaker.Arguments.getHelp();
    }

    @Override
    public void run() throws FileNotFoundException, IOException, ParserConfigurationException,
            SAXException, UnsupportedFormatException {
        DictionaryMaker.main(mArgs);
    }
}