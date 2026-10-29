# PvP Performance — Minecraft Forge 1.8.9

Experimental Forge mod project for measuring and improving Minecraft Java 1.8.9 performance on Android launchers such as Zalith Launcher 2.

## Current status
This is a **starter skeleton**, not an FPS booster yet. It loads as a Forge mod and logs a message; no game behavior has been changed. Optimizations will be added only after a repeatable baseline is measured.

## Target
- Minecraft Java Edition 1.8.9
- Forge `1.8.9-11.15.1.2318-1.8.9`
- Java source/target 8
- Initial test target: Samsung Galaxy S26 Ultra + Zalith Launcher 2

## Build with GitHub Actions
1. Create a GitHub repository and upload the contents of this folder, including `.github`.
2. Open Actions and enable workflows if prompted.
3. Push a commit or run **Build PvPPerformance** manually.
4. Download the `PvPPerformance-1.8.9` artifact from the successful workflow run.
5. Put the JAR into the instance's `mods` folder alongside matching Forge 1.8.9.

The workflow uses Java 8 and Gradle 2.14.1 for the legacy ForgeGradle setup.

## Baseline test
Record FPS in a repeatable scene before installing this mod, then repeat after installing it with identical settings. FPS should be essentially unchanged because this skeleton has no optimization yet. This confirms that measurement is repeatable.

Record average and sustained-low FPS, Motion Blur state, render distance, resolution, renderer/backend, and phone temperature.

## Next step
Add low-overhead diagnostic profiling, then identify the bottleneck before changing rendering or game logic.

## Troubleshooting
If dependency resolution fails, inspect the first Gradle error in the workflow log; legacy Maven artifacts/repositories can change. If the mod crashes, capture `latest.log` and the crash report. Do not compare runs with different renderers or settings.
