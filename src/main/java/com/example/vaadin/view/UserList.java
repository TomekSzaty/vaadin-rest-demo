package com.example.vaadin.view;

import com.example.vaadin.rest.User;
import com.example.vaadin.service.UserService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class UserList extends VerticalLayout {

    public UserList(UserService userService) {

        var grid = new Grid<User>(User.class);
        grid.setItems(userService.getUsers());
        grid.setColumns("id", "name", "phone", "website", "email");
        add(grid);
    }
}
