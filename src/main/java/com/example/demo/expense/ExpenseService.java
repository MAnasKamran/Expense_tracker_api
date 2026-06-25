package com.example.demo.expense;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getExpenses(){
        return expenseRepository.findAll();
    }

    public void addNewExpense(Expense expense){
        if(expense.getDate() == null){
            expense.setDate(LocalDate.now());
        }
        expenseRepository.save(expense);
//        System.out.println(expense);


    }
    public List<Expense> getExpensesByCategory(String category) {
        return expenseRepository.findByCategory(category);
    }

    public void updateExpense(Long id, Expense updatedExpense) {
        // Find the existing expense by ID
        Expense existingExpense = expenseRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                        "Expense with id " + id + " does not exist"
                ));

        // Update the fields
        if (updatedExpense.getDescription() != null) {
            existingExpense.setDescription(updatedExpense.getDescription());
        }
        if (updatedExpense.getAmount() != null) {
            existingExpense.setAmount(updatedExpense.getAmount());
        }
        if (updatedExpense.getDate() != null) {
            existingExpense.setDate(updatedExpense.getDate());
        }
        if (updatedExpense.getCategory() != null) {
            existingExpense.setCategory(updatedExpense.getCategory());
        }

        // Save the updated expense
        expenseRepository.save(existingExpense);
    }

    public void deleteExpense(Long expenseId) {

        boolean exists = expenseRepository.existsById(expenseId);

        if(! exists){
            throw new IllegalStateException("Expense with id " + expenseId + " does not exist");
        }
        expenseRepository.deleteById(expenseId);
    }
}
