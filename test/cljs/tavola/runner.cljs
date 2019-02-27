(ns tavola.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [tavola.core-test]))

(doo-tests 'tavola.core-test)
