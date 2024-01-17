#!/usr/bin/env groovy

def t1() {
    echo 't.t1()'
}

def t2() {
    echo 't.t2()'
}

return [
    t1: this.&t1,
    t2: this.&t2 ]
