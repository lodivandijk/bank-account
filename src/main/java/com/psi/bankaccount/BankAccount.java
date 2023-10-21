package com.psi.bankaccount;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BankAccount {
    private @Id @GeneratedValue Long id;
    private String accountName;
    private Integer accountBalance;

    BankAccount(){}

    BankAccount(String accountName, Integer accountBalance){
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public Long getId(){
        return this.id;
    }

    public String getAccountName(){
        return this.accountName;
    }

    public Integer getAccountBalance(){
        return this.accountBalance;
    }
  
    public void setId(Long id){
        this.id = id;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public void changeAccountBalance(Integer amount){
        this.accountBalance = accountBalance + amount;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
        return true;
        if (!(o instanceof BankAccount))
        return false;
        BankAccount bankAccount = (BankAccount)o;
        return Objects.equals(this.id, bankAccount.id)  && Objects.equals(this.accountName, bankAccount.accountName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.accountName, this.accountBalance);
    }

    @Override
    public String toString(){
        return "BankAccount{id= "+this.id+", name= "+this.accountName+", balance= "+this.accountBalance+"}";
    }
}
