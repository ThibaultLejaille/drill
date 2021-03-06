/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class ParsingError implements Externalizable, Message<ParsingError>, Schema<ParsingError>
{

    public static Schema<ParsingError> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static ParsingError getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ParsingError DEFAULT_INSTANCE = new ParsingError();

    
    private int startColumn;
    private int startRow;
    private int endColumn;
    private int endRow;

    public ParsingError()
    {
        
    }

    // getters and setters

    // startColumn

    public int getStartColumn()
    {
        return startColumn;
    }

    public ParsingError setStartColumn(int startColumn)
    {
        this.startColumn = startColumn;
        return this;
    }

    // startRow

    public int getStartRow()
    {
        return startRow;
    }

    public ParsingError setStartRow(int startRow)
    {
        this.startRow = startRow;
        return this;
    }

    // endColumn

    public int getEndColumn()
    {
        return endColumn;
    }

    public ParsingError setEndColumn(int endColumn)
    {
        this.endColumn = endColumn;
        return this;
    }

    // endRow

    public int getEndRow()
    {
        return endRow;
    }

    public ParsingError setEndRow(int endRow)
    {
        this.endRow = endRow;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<ParsingError> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public ParsingError newMessage()
    {
        return new ParsingError();
    }

    public Class<ParsingError> typeClass()
    {
        return ParsingError.class;
    }

    public String messageName()
    {
        return ParsingError.class.getSimpleName();
    }

    public String messageFullName()
    {
        return ParsingError.class.getName();
    }

    public boolean isInitialized(ParsingError message)
    {
        return true;
    }

    public void mergeFrom(Input input, ParsingError message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 2:
                    message.startColumn = input.readInt32();
                    break;
                case 3:
                    message.startRow = input.readInt32();
                    break;
                case 4:
                    message.endColumn = input.readInt32();
                    break;
                case 5:
                    message.endRow = input.readInt32();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, ParsingError message) throws IOException
    {
        if(message.startColumn != 0)
            output.writeInt32(2, message.startColumn, false);

        if(message.startRow != 0)
            output.writeInt32(3, message.startRow, false);

        if(message.endColumn != 0)
            output.writeInt32(4, message.endColumn, false);

        if(message.endRow != 0)
            output.writeInt32(5, message.endRow, false);
    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 2: return "startColumn";
            case 3: return "startRow";
            case 4: return "endColumn";
            case 5: return "endRow";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("startColumn", 2);
        __fieldMap.put("startRow", 3);
        __fieldMap.put("endColumn", 4);
        __fieldMap.put("endRow", 5);
    }
    
}
