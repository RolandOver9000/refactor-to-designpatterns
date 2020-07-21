package com.csmastery.command.orders;

import com.csmastery.command.service.Chef;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JuniorOrder implements ICommand {

    private com.csmastery.command.service.Chef chef;
    
    @Override
    public void execute() {
        chef.cookSoup();
        chef.cookPasta();
    }
}
