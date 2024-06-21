package com.riwi.LibrosYa.infrastructure.crud;

public interface CrudService<RQ,RS,ID> {
    RS create(RQ request);

    RS get (ID id);

    RS update (RQ request, ID id);

    void delete(ID id);
}
