package ru.redcube.squadrating.entity.work;

import jakarta.persistence.*;
import ru.redcube.squadrating.entity.user.User;

import java.util.List;

@Entity
@Table(name = "hard_work")
public class HardWork extends AbstractWork {

    public HardWork() {
        id = 1L;
        title = "Transferring chairs";
    }

    @ManyToMany
    @JoinTable(
            name = "user_to_hard_work",
            joinColumns = @JoinColumn(name = "work_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;
}
