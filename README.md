# Polar Night Theme

[![CI](https://github.com/evrentan/polar-night-theme/actions/workflows/ci.yml/badge.svg)](https://github.com/evrentan/polar-night-theme/actions/workflows/ci.yml)

A deep navy dark theme with rich but muted syntax colors, designed for focused, distraction-free coding sessions.

![Preview](https://raw.githubusercontent.com/evrentan/polar-night-theme/main/vscode/images/polar-theme-typescript.png)

## Platforms

| Platform | Directory | Marketplace |
|---|---|---|
| Visual Studio Code | [`vscode/`](./vscode) | [VSCode Marketplace](https://marketplace.visualstudio.com/items?itemName=evren.polar-night-theme) |
| JetBrains IDEs | [`jetbrains/`](./jetbrains) | [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/evren.polar-night-theme) |

## Color Palette

| Role | Color |
|---|---|
| Background | `#0d1b2e` — deep navy |
| Foreground | `#b8c8de` — soft blue-white |
| Keywords | `#79b8d4` — muted cyan-blue |
| Types / Classes | `#a89aca` — soft lavender |
| Functions | `#88b8e0` — pale blue |
| Strings | `#7dbf94` — sage green |
| Numbers / Constants | `#c9986a` — muted amber |
| Properties | `#a0c0d8` — light steel blue |
| Comments | `#4e6e8e` — dim blue-gray *(italic)* |
| Operators | `#79a8c0` — muted mid-blue |

## Design Goals

- **Focus-first** — muted, desaturated colors reduce visual noise during long sessions
- **Not pure black** — deep navy background is easier on the eyes than pure black
- **Consistent palette** — same colors across both platforms, always in sync
- **Full coverage** — every UI element and syntax token is explicitly defined

## Language Support

JS / TS · Java · Kotlin · Python · Rust · Go · CSS / SCSS · HTML / JSX · XML · JSON · YAML · Markdown · Shell

## Publishing

Both themes are published manually from the CLI:

```bash
# VSCode Marketplace
cd vscode && npx @vscode/vsce publish

# JetBrains Marketplace (once signing secrets are configured)
cd jetbrains && ./gradlew signPlugin publishPlugin
```

## License

[MIT](./LICENSE)
