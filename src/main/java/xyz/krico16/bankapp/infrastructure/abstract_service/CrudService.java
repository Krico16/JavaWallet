package xyz.krico16.bankapp.infrastructure.abstract_service;

// Request - Response - UUID
public interface CrudService <Req,Res,Id> {

    Res create(Req request);

    Res FindById(Id id);


}
