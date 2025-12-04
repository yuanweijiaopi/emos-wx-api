package com.example.emos.wx.common.statemachine;

/**
 * @ClassName StateMachine
 * @Description TODO
 * @Author aql
 * @Date 2025/11/26 14:21
 * @Version 1.0
 **/
public interface StateMachine<STATE , EVENT > {

    /**
     * 状态机转移
     *
     * @param state
     * @param event
     * @return
     */
    public STATE transition(STATE state, EVENT event);
}
