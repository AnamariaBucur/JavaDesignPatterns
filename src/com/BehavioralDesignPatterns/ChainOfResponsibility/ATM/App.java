package com.BehavioralDesignPatterns.ChainOfResponsibility.ATM;

public class App {
    public static void main(String[] args) {
            var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
            var atm = buildChain();
            atm.dispense(request);
    }

    //check USD first
    //start at the end of the Chain
    private static ATM buildChain() {
        var euroATM = new EuroATM(null); //end of the Chain
        var usDollarATM = new UsDollarATM(euroATM);
        return usDollarATM;
    }
}
