package jp.cm.tonightDinner.repository;

import jp.cm.tonightDinner.entity.Dinner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinnerRepository extends JpaRepository<Dinner, Integer> {

}
