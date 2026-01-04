package com.example.emos.wx.common.statemachine;

import com.example.emos.wx.exception.BizException;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

import java.util.Map;

import static com.example.emos.wx.exception.BizErrorCode.STATE_MACHINE_TRANSITION_FAILED;

/**
 * @ClassName BaseMachine
 * @Description TODO
 * @Author aql
 * @Date 2025/11/26 14:26
 * @Version 1.0
 **/
public class BaseMachines<STATE , EVENT> implements StateMachine<STATE , EVENT>{

    private Map<String, STATE> stateTransitions = Maps.newHashMap();

    protected void putTransition(STATE origin, EVENT event, STATE target){
        stateTransitions.put(Joiner.on("_").join(origin, event), target);
    }

    @Override
    public STATE transition(STATE state, EVENT event) {
        STATE target = stateTransitions.get(Joiner.on("_").join(state, event));

        if (target == null){
            throw new BizException("state = " + state + " , event = " + event,STATE_MACHINE_TRANSITION_FAILED);
        }
        return target;
    }
}
