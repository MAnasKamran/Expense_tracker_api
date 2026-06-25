package com.example.demo.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api/v1/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService){
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<Expense> getExpenses(){
        return expenseService.getExpenses();
    }

    @PostMapping
    public void registerNewExpense(@RequestBody Expense expense){
        expenseService.addNewExpense(expense);
    }

    @GetMapping("/category/{category}")
    public List<Expense> getExpensesByCategory(@PathVariable String category) {
        return expenseService.getExpensesByCategory(category);
    }

    @PutMapping("/{id}")
    public void updateExpense(
            @PathVariable Long id,
            @RequestBody Expense updatedExpense) {
        expenseService.updateExpense(id, updatedExpense);
    }

    @DeleteMapping(path = "{expenseId}")
    public void deleteExpense(@PathVariable ("expenseId") Long expenseId){
        expenseService.deleteExpense(expenseId);
    }
}
