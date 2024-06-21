package com.riwi.LibrosYa.api.controllers;

import org.springframework.http.ResponseEntity;

public interface GenericController<RQ,RS,ID> {
    public ResponseEntity<RS> create(RQ request);

    public ResponseEntity<RS> get (ID id);

    public  ResponseEntity<RS> update(RQ request, ID id);

    public ResponseEntity<Void> delete(ID id);

}
