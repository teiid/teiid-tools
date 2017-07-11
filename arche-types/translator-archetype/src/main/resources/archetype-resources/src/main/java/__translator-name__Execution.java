/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ${package};


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.teiid.language.ColumnReference;
import org.teiid.language.Condition;
import org.teiid.language.DerivedColumn;
import org.teiid.language.Expression;
import org.teiid.language.Select;
import org.teiid.logging.LogConstants;
import org.teiid.logging.LogManager;
import org.teiid.metadata.Column;
import org.teiid.translator.DataNotAvailableException;
import org.teiid.translator.ResultSetExecution;
import org.teiid.translator.TranslatorException;


/**
 * Represents the execution of a command.
 */
public class ${translator-name}Execution implements ResultSetExecution {


    private Select command;
    
    // Execution state
    Iterator<List<?>> results;
    int[] neededColumns;
    private Select query;

    /**
     * 
     */
    public ${translator-name}Execution(Select query) {
        this.query = query;
    }
    
    @Override
    public void execute() throws TranslatorException {
        // Log our command
        LogManager.logDetail(LogConstants.CTX_CONNECTOR, ${translator-name}Plugin.UTIL.getString("execute_query", new Object[] { "${translator-name}", command })); //$NON-NLS-1$
    }    


    @Override
    public List<?> next() throws TranslatorException, DataNotAvailableException {
        if (results.hasNext()) {
            return projectRow(results.next(), neededColumns);
        }
        return null;
    }

    /**
     * @param row
     * @param neededColumns
     */
    static List<Object> projectRow(List<?> row, int[] neededColumns) {
        List<Object> output = new ArrayList<Object>(neededColumns.length);
        
        for(int i=0; i<neededColumns.length; i++) {
            output.add(row.get(neededColumns[i]-1));
        }
        
        return output;    
    }

    @Override
    public void close() {
        LogManager.logDetail(LogConstants.CTX_CONNECTOR, ${translator-name}Plugin.UTIL.getString("close_query")); //$NON-NLS-1$

    
    }

    @Override
    public void cancel() throws TranslatorException {
        LogManager.logDetail(LogConstants.CTX_CONNECTOR, ${translator-name}Plugin.UTIL.getString("cancel_query")); //$NON-NLS-1$
    }
}
