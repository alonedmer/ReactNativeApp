import React from 'react';
import {
  StyleSheet,
  View,
  Text
} from 'react-native';

const Home = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.hello}>Home Page</Text>
      <Text style={{ color: 'blue', fontSize: 20, textAlign: 'center' }}>title</Text>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 30,
    textAlign: 'center',
    margin: 10,
    color: '#FF2A74'
  },
});

export default Home;