package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

public class ArrayStorage extends AbstractArrayStorage {

    @Override
    protected int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    protected void insertAndMoveElements(int index, Resume resume) {
        storage[size] = resume;
    }

    @Override
    protected void deleteAndMoveElements(int index) {
        storage[index] = storage[size - 1];
    }
}