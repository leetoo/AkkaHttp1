import java.io.{File, FileOutputStream}

import sun.misc.BASE64Decoder

import scala.io.Source

val base64 = """TlRMTVNTUAADAAAAGAAYAIoAAAAaARoBogAAAAQABABYAAAAFAAUAFwAAAAaABoAcAAAAAAAAAC8AQAABYKIogoAWikAAAAPi1PbWMag01GAkZt1Qf318ksATABLAGkAcgBpAGMAaABlAG4AawBvAEsASQBSAEkAQwBIAEUATgBLAE8ALQBYAFAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMbxakDXA49ZMKuGgdYpBlgEBAAAAAAAAoAShWZf/0QHtZlashcwEAwAAAAACAAQASwBMAAEAFgBXAEwALQBMAEUARwBJAE8ALQA0ADUABAAMAGEAdgBwAC4AcgB1AAMAJAB3AGwALQBsAGUAZwBpAG8ALQA0ADUALgBhAHYAcAAuAHIAdQAHAAgAoAShWZf/0QEGAAQAAgAAAAgAMAAwAAAAAAAAAAEAAAAAIAAASC+ISui7aVeVHRiiuCoHYWEfGfQaSqCJJKjQHfkQB3wKABAAAAAAAAAAAAAAAAAAAAAAAAkAKABIAFQAVABQAC8AMQAwAC4ANwAwAC4AMQA2AC4AMQA5ADIAOgA4ADAAAAAAAAAAAAAAAAAA"""
val buff = new BASE64Decoder().decodeBuffer(base64)

new String(buff)
val userLength = (buff(37) << 8 | buff(36)).toShort
val userOffset = (buff(41) << 8 | buff(40)).toShort
val userBuff = buff.slice(userOffset.toInt, userOffset.toInt + userLength.toInt)
new String(userBuff)

