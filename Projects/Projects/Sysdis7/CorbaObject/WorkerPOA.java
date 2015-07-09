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
// IDL:CorbaObject/Worker:1.0
//
public abstract class WorkerPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               WorkerOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:CorbaObject/Worker:1.0",
    };

    public Worker
    _this()
    {
        return WorkerHelper.narrow(super._this_object());
    }

    public Worker
    _this(org.omg.CORBA.ORB orb)
    {
        return WorkerHelper.narrow(super._this_object(orb));
    }

    public String[]
    _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectId)
    {
        return _ob_ids_;
    }

    public org.omg.CORBA.portable.OutputStream
    _invoke(String opName,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler handler)
    {
        final String[] _ob_names =
        {
            "areUstilWorking",
            "cancelTask",
            "executeJob",
            "setId",
            "updateJob",
            "wakeUp"
        };

        int _ob_left = 0;
        int _ob_right = _ob_names.length;
        int _ob_index = -1;

        while(_ob_left < _ob_right)
        {
            int _ob_m = (_ob_left + _ob_right) / 2;
            int _ob_res = _ob_names[_ob_m].compareTo(opName);
            if(_ob_res == 0)
            {
                _ob_index = _ob_m;
                break;
            }
            else if(_ob_res > 0)
                _ob_right = _ob_m;
            else
                _ob_left = _ob_m + 1;
        }

        if(_ob_index == -1 && opName.charAt(0) == '_')
        {
            _ob_left = 0;
            _ob_right = _ob_names.length;
            String _ob_ami_op =
                opName.substring(1);

            while(_ob_left < _ob_right)
            {
                int _ob_m = (_ob_left + _ob_right) / 2;
                int _ob_res = _ob_names[_ob_m].compareTo(_ob_ami_op);
                if(_ob_res == 0)
                {
                    _ob_index = _ob_m;
                    break;
                }
                else if(_ob_res > 0)
                    _ob_right = _ob_m;
                else
                    _ob_left = _ob_m + 1;
            }
        }

        switch(_ob_index)
        {
        case 0: // areUstilWorking
            return _OB_op_areUstilWorking(in, handler);

        case 1: // cancelTask
            return _OB_op_cancelTask(in, handler);

        case 2: // executeJob
            return _OB_op_executeJob(in, handler);

        case 3: // setId
            return _OB_op_setId(in, handler);

        case 4: // updateJob
            return _OB_op_updateJob(in, handler);

        case 5: // wakeUp
            return _OB_op_wakeUp(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_areUstilWorking(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = areUstilWorking();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_cancelTask(org.omg.CORBA.portable.InputStream in,
                      org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        int _ob_a0 = in.read_long();
        cancelTask(_ob_a0);
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_executeJob(org.omg.CORBA.portable.InputStream in,
                      org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        byte[] _ob_a0 = CorbaObject.WorkerPackage.octetListHelper.read(in);
        int[] _ob_a1 = CorbaObject.WorkerPackage.longListHelper.read(in);
        int _ob_a2 = in.read_long();
        int _ob_a3 = in.read_long();
        int _ob_a4 = in.read_long();
        int _ob_a5 = in.read_long();
        int _ob_a6 = in.read_long();
        executeJob(_ob_a0, _ob_a1, _ob_a2, _ob_a3, _ob_a4, _ob_a5, _ob_a6);
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_setId(org.omg.CORBA.portable.InputStream in,
                 org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        int _ob_a0 = in.read_long();
        setId(_ob_a0);
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_updateJob(org.omg.CORBA.portable.InputStream in,
                     org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        int _ob_a0 = in.read_long();
        int _ob_a1 = in.read_long();
        updateJob(_ob_a0, _ob_a1);
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_wakeUp(org.omg.CORBA.portable.InputStream in,
                  org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        wakeUp();
        out = handler.createReply();
        return out;
    }
}
