# Uranus - NeoForge 26.3 Port

> **Unofficial** NeoForge 26.3 (Minecraft 26.3) port. Not affiliated with or endorsed by the original authors.

## Credits

This is an **unofficial port** of **[Uranus](https://www.curseforge.com/minecraft/mc-mods/uranus)** by **IAFEnvoy**, a library with an animation engine, object helpers and more (partly based on LLibrary and Citadel).

- Original mod: https://www.curseforge.com/minecraft/mc-mods/uranus
- Original source: https://github.com/IAFEnvoy/Uranus
- NeoForge 26.3 port by Ashtonite365

## Licence

Uranus is licensed under the **GNU LGPL-3.0-or-later**. This port is a modified version and is released under the same LGPL-3.0 licence. The jar includes the licence text (`LICENSE_uranus`) and a modification notice (`NOTICE_uranus`).


## How this port differs

- Ported from **Uranus 3.0-alpha.1 (NeoForge, Minecraft 26.1.2; upstream commit d203bc9)** to **NeoForge 26.3.0.76+ for Minecraft 26.3**. The source was adapted to the 26.3 APIs.
- **Unofficial and beta:** expect bugs.
- The mod id is changed to **`uranus_port263`**. The content namespace is still `uranus`. Don't install it alongside the official Uranus.
- It is mainly a library dependency of the Ice and Fire CE NeoForge Port.

## Not affiliated

This port is **not affiliated with or endorsed by** IAFEnvoy. Please don't report bugs from this port upstream.

## Building

See `NOTICE` for the modification notice.

`./gradlew build` (JDK required; the jar lands in `build/libs/`).
