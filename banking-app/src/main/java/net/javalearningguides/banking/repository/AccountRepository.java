package net.javalearningguides.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javalearningguides.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{

}
