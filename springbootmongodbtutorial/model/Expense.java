package com.programming.techie.springbootmongodbtutorial.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.math.BigDecimal;

@Document("expense")
public class Expense {
	@Id
	private String id;
	@Field(name = "name")
	@Indexed(unique = true)
	private String expenseName;
	@Field(name = "category")
	private ExpenseCategory expenseCategory;
	@Field(name = "amount")
	private BigDecimal expenseAmount;
	
	public Expense(String id, String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount) {
		super();
		this.id = id;
		this.expenseName = expenseName;
		this.expenseCategory = expenseCategory;
		this.expenseAmount = expenseAmount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getExpenseName() {
		return expenseName;
	}
	public ExpenseCategory getExpenseCategory() {
		return expenseCategory;
	}
	public BigDecimal getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}
	public void setExpenseCategory(ExpenseCategory expenseCategory) {
		this.expenseCategory = expenseCategory;
	}
	public void setExpenseAmount(BigDecimal expenseAmount) {
		this.expenseAmount = expenseAmount;
	}	
}
