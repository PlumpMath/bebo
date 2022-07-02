# bebo

SCI + deno experiment.

## Install from CDN

```
$ deno install --allow-all --name bebo https://cdn.jsdelivr.net/npm/bebo@0.0.5/lib/bebo_main.js
```

Then run `bebo` on a `.cljs` local or remote file:

```
$ bebo run https://raw.githubusercontent.com/borkdude/bebo/main/examples/server/example.cljs
Listening on http://localhost:8080/
```

## Build and run

```
$ npx shadow-cljs release bebo
$ deno run --allow-read --allow-net lib/bebo_main.js examples/server/example.cljs
Listening on http://localhost:8080/
```
