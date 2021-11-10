package org.hpccsystems.ws.client.wrappers.gen.filespray;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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
 *******************************************************************************/

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: SprayResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2021-10-27T18:52:06.507Z
 */
public class SprayResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;

    public SprayResponseWrapper() {}

    public SprayResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayResponse sprayresponse)
    {
        copy( sprayresponse );
    }
    public SprayResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();

    }

    @Override
    public String toString()
    {
        return "SprayResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayResponse();
        raw.setWuid( local_wuid);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
}