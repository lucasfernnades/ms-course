package com.lks.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lks.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}