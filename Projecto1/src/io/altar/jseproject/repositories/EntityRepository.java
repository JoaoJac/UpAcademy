package io.altar.jseproject.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.altar.jseproject.model.Entity_;

abstract class EntityRepository <T extends Entity_>{
	Map<Long,T> mapIdEntity= new HashMap<>();
	long maxId = 1;
	
	private long nextId() {
		return ++maxId;
	}
	
	public long createEntity (T entity){
		mapIdEntity.put(maxId, entity);
		entity.setId(maxId);
		return nextId();
	}
	
	public Collection<T> getAll(){
		return mapIdEntity.values();	
	}
	
	public T getEntityById (long id){
		return mapIdEntity.get(id);	
	}
	
	public void editEntity (T entity) {
		mapIdEntity.replace(entity.getId(), entity);
	}
	
	public void removeEntityById (long id) {
		mapIdEntity.remove(id);
	}
}
