package io.altar.jseproject.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.altar.jseproject.model.Entity_;

abstract class EntityRepository <T extends Entity_>{
	Map<Long,T> mapIdEntity= new HashMap<>();
	Long maxId;
	
	private Long nextId() {
		return ++maxId;
	}
	
	public Long createEntity (T entity){
		return nextId();
	}
	
	public Collection<T> getAll(){
		return mapIdEntity.values();	
	}
	
	public T getEntityById (Long id){
		return mapIdEntity.get(id);	
	}
	
	public void editEntity (T entity) {
		//TODO
	}
	
	public void removeEntityById (Long id) {
		mapIdEntity.remove(id);
	}
}
