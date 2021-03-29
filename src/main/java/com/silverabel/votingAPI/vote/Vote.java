package com.silverabel.votingAPI.vote;

public class Vote {

    private Integer answer_id;

    public Vote() {
    }

    public Vote(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "answer_id=" + answer_id +
                '}';
    }
}
