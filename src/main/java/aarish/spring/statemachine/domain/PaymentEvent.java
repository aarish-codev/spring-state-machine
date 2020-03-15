package aarish.spring.statemachine.domain;

public enum PaymentEvent {
    PRE_AUTHROIZE, PRE_AUTH_APPROVED, PRE_AUTH_DECLINED, AUTHORIZE, AUTH_APPROVED, AUTH_DECLINED
}
