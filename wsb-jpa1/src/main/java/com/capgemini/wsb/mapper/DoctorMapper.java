package com.capgemini.wsb.mapper;


import org.springframework.stereotype.Component;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.dto.DoctorTO;

@Component
public class DoctorMapper {
    public DoctorTO toTO(DoctorEntity entity) {
        if (entity == null) {
            return null;
        }

        DoctorTO to = new DoctorTO();
        to.setId(entity.getId());
        to.setFirstName(entity.getFirstName());
        to.setLastName(entity.getLastName());
        to.setTelephoneNumber(entity.getTelephoneNumber());
        to.setEmail(entity.getEmail());
        to.setDoctorNumber(entity.getDoctorNumber());
        to.setSpecialization(entity.getSpecialization());

        return to;
    }

    public DoctorEntity toEntity(DoctorTO to) {
        if (to == null) {
            return null;
        }

        DoctorEntity entity = new DoctorEntity();
        entity.setId(to.getId());
        entity.setFirstName(to.getFirstName());
        entity.setLastName(to.getLastName());
        entity.setTelephoneNumber(to.getTelephoneNumber());
        entity.setEmail(to.getEmail());
        entity.setDoctorNumber(to.getDoctorNumber());
        entity.setSpecialization(to.getSpecialization());

        return entity;
    }
}
