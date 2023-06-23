package org.hpccsystems.ws.client.wrappers.gen.wstopology;

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
 * Class name: TpLdapServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpLdapServerWrapper
{
    protected String local_name;
    protected String local_description;
    protected String local_build;
    protected String local_path;
    protected ArrayOfTpMachineWrapper local_tpMachines;

    public TpLdapServerWrapper() {}

    public TpLdapServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer tpldapserver)
    {
        copy( tpldapserver );
    }
    public TpLdapServerWrapper( String _name, String _description, String _build, String _path, ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_name = _name;
        this.local_description = _description;
        this.local_build = _build;
        this.local_path = _path;
        this.local_tpMachines = _tpMachines;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_description = raw.getDescription();
        this.local_build = raw.getBuild();
        this.local_path = raw.getPath();
        if (raw.getTpMachines() != null)
            this.local_tpMachines = new ArrayOfTpMachineWrapper( raw.getTpMachines());

    }

    @Override
    public String toString()
    {
        return "TpLdapServerWrapper [" + "name = " + local_name + ", " + "description = " + local_description + ", " + "build = " + local_build + ", " + "path = " + local_path + ", " + "tpMachines = " + local_tpMachines + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer();
        raw.setName( local_name);
        raw.setDescription( local_description);
        raw.setBuild( local_build);
        raw.setPath( local_path);
        if (local_tpMachines != null)
            raw.setTpMachines( local_tpMachines.getRaw());
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setBuild( String _build )
    {
        this.local_build = _build;
    }
    public String getBuild( )
    {
        return this.local_build;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setTpMachines( ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_tpMachines = _tpMachines;
    }
    public ArrayOfTpMachineWrapper getTpMachines( )
    {
        return this.local_tpMachines;
    }
}