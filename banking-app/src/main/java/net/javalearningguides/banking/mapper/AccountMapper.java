package net.javalearningguides.banking.mapper;

import net.javalearningguides.banking.dto.AccountDto;
import net.javalearningguides.banking.entity.Account;

public class AccountMapper {
	
//	to convert accountdto to account jpa or entity
	public static Account mapToAccount(AccountDto accountDto) {
		Account account=new Account(
				
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				);
		return account;
				
	}
	
//	to convert account jpa or entity to accountDto
	
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto=new AccountDto(
				
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
				);
		return accountDto;
				
	}

}
