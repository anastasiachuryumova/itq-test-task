package itq.test.task.mappers;

import itq.test.task.dto.RegisterDto;
import itq.test.task.entity.Register;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-02T12:25:10+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 24.0.1 (Oracle Corporation)"
)
@Component
public class RegisterMapperImpl implements RegisterMapper {

    @Override
    public Register dtoToEntity(RegisterDto registerDto) {
        if ( registerDto == null ) {
            return null;
        }

        Register.RegisterBuilder register = Register.builder();

        register.id( registerDto.getId() );
        register.status( registerDto.getStatus() );

        return register.build();
    }

    @Override
    public RegisterDto entityToDto(Register register) {
        if ( register == null ) {
            return null;
        }

        RegisterDto.RegisterDtoBuilder registerDto = RegisterDto.builder();

        registerDto.id( register.getId() );
        registerDto.status( register.getStatus() );

        return registerDto.build();
    }

    @Override
    public List<Register> dtosToEntities(List<RegisterDto> registerDtos) {
        if ( registerDtos == null ) {
            return null;
        }

        List<Register> list = new ArrayList<Register>( registerDtos.size() );
        for ( RegisterDto registerDto : registerDtos ) {
            list.add( dtoToEntity( registerDto ) );
        }

        return list;
    }

    @Override
    public List<RegisterDto> entitiesToDtos(List<Register> registers) {
        if ( registers == null ) {
            return null;
        }

        List<RegisterDto> list = new ArrayList<RegisterDto>( registers.size() );
        for ( Register register : registers ) {
            list.add( entityToDto( register ) );
        }

        return list;
    }
}
