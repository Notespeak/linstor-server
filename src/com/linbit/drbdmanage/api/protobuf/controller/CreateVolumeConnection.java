package com.linbit.drbdmanage.api.protobuf.controller;

import java.io.IOException;
import java.io.InputStream;

import com.linbit.drbdmanage.api.ApiCallRc;
import com.linbit.drbdmanage.api.ApiConsts;
import com.linbit.drbdmanage.api.protobuf.BaseProtoApiCall;
import com.linbit.drbdmanage.api.protobuf.ProtobufApiCall;
import com.linbit.drbdmanage.core.Controller;
import com.linbit.drbdmanage.netcom.Message;
import com.linbit.drbdmanage.netcom.Peer;
import com.linbit.drbdmanage.proto.MsgCrtVlmConnOuterClass.MsgCrtVlmConn;
import com.linbit.drbdmanage.security.AccessContext;

@ProtobufApiCall
public class CreateVolumeConnection extends BaseProtoApiCall
{
    private final Controller controller;

    public CreateVolumeConnection(Controller controllerRef)
    {
        super(controllerRef.getErrorReporter());
        controller = controllerRef;
    }

    @Override
    public String getName()
    {
        return ApiConsts.API_CRT_VLM_CONN;
    }

    @Override
    public String getDescription()
    {
        return "Defines volume connection options";
    }

    @Override
    protected void executeImpl(
        AccessContext accCtx,
        Message msg,
        int msgId,
        InputStream msgDataIn,
        Peer client
    )
        throws IOException
    {
        MsgCrtVlmConn msgCreateVlmConn = MsgCrtVlmConn.parseDelimitedFrom(msgDataIn);
        ApiCallRc apiCallRc = controller.getApiCallHandler().createVolumeConnection(
            accCtx,
            client,
            msgCreateVlmConn.getNodeName1(),
            msgCreateVlmConn.getNodeName2(),
            msgCreateVlmConn.getResourceName(),
            msgCreateVlmConn.getVolumeNr(),
            asMap(msgCreateVlmConn.getVolumeConnPropsList())
        );
        super.answerApiCallRc(accCtx, client, msgId, apiCallRc);
    }
}