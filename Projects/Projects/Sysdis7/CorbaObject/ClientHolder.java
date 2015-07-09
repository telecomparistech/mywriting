// **********************************************************************
//
// Generated by the ORBacus IDL to Java Translator
//
// Copyright (c) 2005
// IONA Technologies, Inc.
// Waltham, MA, USA
//
// All Rights Reserved
//
// **********************************************************************

// Version: 4.3.2

package CorbaObject;

//
// IDL:CorbaObject/Client:1.0
//
final public class ClientHolder implements org.omg.CORBA.portable.Streamable
{
    public Client value;

    public
    ClientHolder()
    {
    }

    public
    ClientHolder(Client initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ClientHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ClientHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ClientHelper.type();
    }
}
