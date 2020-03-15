package aarish.spring.statemachine.service;

import aarish.spring.statemachine.domain.Payment;
import aarish.spring.statemachine.domain.PaymentEvent;
import aarish.spring.statemachine.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {
    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
}
