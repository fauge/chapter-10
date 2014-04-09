package com.bddinaction.chapter10.cucumber.steps;

import com.bddinaction.chapter10.model.Account;
import com.bddinaction.chapter10.cucumber.steps.persona.FrequentFlyerPersona;
import com.bddinaction.chapter10.model.Status;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class TransferSteps {

    private final FrequentFlyerHelper frequentFlyerHelper;

    public TransferSteps(FrequentFlyerHelper frequentFlyerHelper) {
        this.frequentFlyerHelper = frequentFlyerHelper;
    }

    @Given("^(.*) is a Frequent Flyer member$")
    public void Joe_is_a_Frequent_Flyer_member(FrequentFlyerPersona frequentFlyerPersona) throws Throwable {
        frequentFlyerHelper.setFrequentFlyer(frequentFlyerPersona.getFrequentFlyer());
    }

    @Given("I am a (.*) Frequent Flyer member")
    public void useAMemberWithAGivenStatus(Status status) {

    }

    @Given("^the following accounts:$")
    public void the_following_accounts(List<Account> accounts) throws Throwable {

    }

    @When("^(.*) transfers (\\d+) points to (.*)$")
    public void Joe_transfers_points_to_Jill(String from, int amount, String to) throws Throwable {
    }

    @Then("^the accounts should be the following:$")
    public void the_accounts_should_be_the_following(DataTable accounts) throws Throwable {
    }
}
