# Vault-Events
VaultAPI wrapper for adding events to Vault

See VaultAPI here:
https://github.com/MilkBowl/VaultAPI

## Dependency information

```kotlin
repositories {
    maven {
        name = "crystalsRepository"
        url = uri("https://repo.crystals.gg/releases")
        credentials(PasswordCredentials::class)
    }
}

dependencies {
    implementation("net.crystals:VaultEvents:1.7.1")
}
```

plugin.yml:
```yml
(soft)depend: [Vault, VaultEvents]
```

## Listening for events

Use the Event API of Spigot: https://www.spigotmc.org/wiki/using-the-event-api/

- [See available events](https://github.com/Rsl1122/Vault-Events/tree/master/src/main/java/com/djrapitops/vaultevents/events) 

## License

Licensed under MIT-license
