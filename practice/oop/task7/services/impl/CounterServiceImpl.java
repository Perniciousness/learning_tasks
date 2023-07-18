package practice.oop.task7.services.impl;

import practice.oop.task7.services.CounterService;

public class CounterServiceImpl implements CounterService {

    private long count;
    private long max;

    public CounterServiceImpl(long count, long max) {
        this.count = count;
        this.max = max;
    }

    @Override
    public boolean isMaxValueReached() {
        
        return count == max;
    }

    @Override
    public void setCurrentValue(long count) {
        
        this.count = count;
    }
    
}
