package co.fullstacklabs.cuboid.challenge.service;

import co.fullstacklabs.cuboid.challenge.dto.CuboidDTO;
import co.fullstacklabs.cuboid.challenge.model.Cuboid;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
public interface CuboidService {
    CuboidDTO create(CuboidDTO cuboid);

    @Transactional
    Cuboid delete(Long id);

    List<CuboidDTO> getAll();

}
