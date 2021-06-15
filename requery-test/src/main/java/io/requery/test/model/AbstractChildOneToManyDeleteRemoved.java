package io.requery.test.model;

import io.requery.CascadeAction;
import io.requery.Column;
import io.requery.Entity;
import io.requery.ForeignKey;
import io.requery.Key;
import io.requery.ManyToOne;
import io.requery.ReferentialAction;

@Entity(cacheable = false)
public abstract class AbstractChildOneToManyDeleteRemoved {
    @Key
    long id;

    @Column
    String attribute;

    @Column(nullable = false)
    @ManyToOne(cascade = CascadeAction.NONE)
    @ForeignKey()
    ParentDeleteRemoved parent;
}
