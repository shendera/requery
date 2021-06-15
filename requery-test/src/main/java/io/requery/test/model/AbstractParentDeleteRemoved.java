package io.requery.test.model;

import java.util.List;

import io.requery.CascadeAction;
import io.requery.Entity;
import io.requery.Key;
import io.requery.OneToMany;

@Entity(cacheable = false)
public abstract class AbstractParentDeleteRemoved {
    @Key
    long id;

    @OneToMany(cascade = {CascadeAction.SAVE, CascadeAction.DELETE})
    List<ChildOneToManyDeleteRemoved> oneToMany;
}
