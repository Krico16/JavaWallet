package xyz.krico16.bankapp.user.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import xyz.krico16.bankapp.user.domain.model.User;

@Mapper(componentModel = "spring")
public interface userRequest {


    @Mapping(source = "id",target = "id")
    @Mapping(source = "document_number",target = "document_number")
    @Mapping(source = "names",target = "names")
    @Mapping(source = "lastnames",target = "lastnames")
    @Mapping(source = "email",target = "email")
    @Mapping(source = "password",target = "password")
    User toDomain();
}
