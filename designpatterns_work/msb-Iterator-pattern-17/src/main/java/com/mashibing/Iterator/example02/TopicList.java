package com.mashibing.Iterator.example02;

/**
 * 具体集合类
 * @author spikeCong
 * @date 2022/10/18
 **/
public class TopicList implements ListList<Topic> {

    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public IteratorIterator<Topic> Iterator() {
        return new TopicIterator(topics);
    }
}
