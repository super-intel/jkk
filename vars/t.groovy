#!/usr/bin/env groovy

def t1() {
    echo 't.t1()'
}

def t2() {
    echo 't.t2()'
}

def stg_t3() {
    stage('t3') {
        steps {
            script {
                echo 'stg_t3'
            }
        }
    }
}

def stg_bld(name) {
    return {
        stage("${name}") {
            script {
                echo "${name}"
            }
        }
    }
}

return [
    t1: this.&t1,
    t2: this.&t2,
    stg_t3: this.&stg_t3,
    stg_bld: this.&stg_bld
    
]
