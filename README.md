OTel for Browsers:
https://docs.honeycomb.io/send-data/javascript-browser/honeycomb-distribution/


## The problem

Have a look at `dev/foo/dev.cljs`, line 3:

```clojure
(ns foo.dev
  (:require
    ["@honeycombio/opentelemetry-web" :refer [HoneycombWebSDK]]))
```

This will cause a Closure compiler failure:

```
[:app] Compiling ...
[:app] Build failure:
Closure compilation failed with 2 errors
--- node_modules/@honeycombio/opentelemetry-web/dist/cjs/index.js:1179
Illegal variable reference before declaration: startTime
--- node_modules/@opentelemetry/sdk-metrics/build/src/aggregator/ExponentialHistogram.js:54
Illegal variable reference before declaration: startTime
```
