package com.psi.bankaccount;

import org.springframework.data.jpa.repository.JpaRepository;


interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}